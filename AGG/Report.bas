Type=Class
Version=7.3
ModulesStructureVersion=1
B4A=true
@EndOfDesignText@

Sub Class_Globals
	Private Position As String
	Private Thread As Thread	'Ignore
	Private reportData As Map
	Private rep As Report
	Private isOK As Boolean = True
	Public crash As Boolean = False
End Sub

'Initializes the object. You can add parameters to this method if needed.
Public Sub Initialize(Report As Report,ReportPostion As String)
'	SQL = ReportSql
	rep = Report
	Position = ReportPostion
	reportData.Initialize
	Thread.Initialise("Thread")
End Sub

Public Sub Start
	Thread.Start(Me,"Execute_SQL",Null)
End Sub

Public Sub Execute_SQL
	Dim dateCounter=0,otherCounter=0 As Int
	Dim firstKey,secondKey As String
	Dim QueryRes As List
	QueryRes.Initialize
	QueryRes.AddAll(Main.DB.Exec_Query(rep.Query,True))
	
	If QueryRes.Size>0 Then
		Dim tList As List
		tList.Initialize
		tList.AddAll(QueryRes.Get(0))
	
		firstKey = tList.Get(0)
		secondKey = tList.Get(1)
		
		'only for crash test
		If crash Then
			QueryRes.Add(tList)
		End If
		
		If IsNumber(firstKey) Or IsNumber(secondKey) Then
			isOK=False
			Return
		End If
		
		For i = 1 To QueryRes.Size - 1
			Dim tempList As List = QueryRes.Get(i)
			Dim key As String = tempList.Get(0)
			Dim value As String = tempList.Get(1)
			If value <> firstKey And value <> secondKey And key <> firstKey And key <>secondKey Then
				If IsNumber(value) Then
					value=Round2(value,2)
				Else
					If Support.isDate(value) Then
						dateCounter = dateCounter +1
					Else
						otherCounter = otherCounter + 1
					End If
				End If
				'Date fix
				If Support.isDate(key) Then
					key = Support.ToNormalDate(key)
					key = Support.RemoveYearFromDate(key)
				End If
				
				If value.EqualsIgnoreCase("null") Or value = Null Then value = 0
				reportData.Put(key,value)
			Else
				isOK = False
				Return
			End If
			If dateCounter>otherCounter And otherCounter > 0 Then
				isOK = False
				Return
			End If
		Next
	End If
End Sub

Sub Thread_Ended(endedOK As Boolean, error As String) 'The thread has terminated. If endedOK is False error holds the reason for failure
	CallSubDelayed2(Main,"AddRep_ToScreen",Array As Object(Position,reportData,rep,isOK))
End Sub