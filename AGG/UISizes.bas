B4A=true
Group=Default Group
ModulesStructureVersion=1
Type=StaticCode
Version=7.3
@EndOfDesignText@
'Subs in this code module will be accessible from all modules.
Private Sub Process_Globals

	Public DefaultPadding As Int
	Public ChartDefaultHeight As Int
	Public ObjectsStartingLeft As Int
	Public ObjectsStartingTop As Int
	Public ObjectsDefaultButtonHeight As Int
	Public ObjectsDefaultLabelHeight As Int
	Public ObjectVSeperation As Int
	Public SCrollBottomPadding As Int = 2dip 'Ignore. Adds to the bottom of the scroll view (but it's not adding right now for better fit)
	Public DefaultTextSize As Int
	Public DefaultButtonWidth, DefaultEditWidth, DefaultLabelWidth As Int
	Public QuickChartLeft, QuickChartLeftOriginal As Int
	Public LabelEditSpacing As Int
	Public DefaultTitleSize, DefaultButtonTextSize, DefaultBigTitleSize, DefaultChartTextSize, DefaultErrMsgSize As Int
	Public MainHeaderHeight, MainHeaderHeightLandscape As Int
	Public imagePadding As Int
	Public TableHeaderHeight As Int
	Public DefaultControlHeight As Int
	Public FloatingButtonSize, SmallFloatingButtonSize As Int
	Public FloatingAnimSpeed As Int
	Public SlideMenuWidth As Int

End Sub

'Инициализиране на обекта / Initializes the object
Public Sub Initialize
	'Assign Defaults
		DefaultPadding = 1%x

	ObjectsStartingLeft = 2%x			'Default 2%x, where the graphs/tables/lables start on the left
	ObjectsDefaultButtonHeight = 42dip	'Default 42dip, lower for thinner buttons
	ObjectsDefaultLabelHeight  = 32dip	'Default 48dip, 32dip or lower to save screen space
	ChartDefaultHeight = 77%y
	ObjectVSeperation = 0.5%y
	SlideMenuWidth = 164dip
	DefaultButtonWidth = 22%x
	DefaultEditWidth = 40%x
	DefaultLabelWidth = 108dip
	QuickChartLeft = 36%x
	QuickChartLeftOriginal = 36%x
	LabelEditSpacing = 6dip
	
	'Text Sizes
	DefaultTextSize = 12 'Default 12
	DefaultErrMsgSize = 16	'Default 16
	RecalculateSizes

	MainHeaderHeight =  42dip 'Default 52dip, 42dip - to save screen space
	MainHeaderHeightLandscape =  42dip 'Default 52dip, 42dip - to save screen space
	ObjectsStartingTop = 8dip
	imagePadding = 8dip
	TableHeaderHeight = 48dip 
	DefaultControlHeight = DipToCurrent(24 + DefaultTextSize)
	DefaultLabelWidth = DipToCurrent(108 + DefaultTextSize)
	SmallFloatingButtonSize = 50dip
	FloatingAnimSpeed = 110
End Sub

'Set the text sizes again
Public Sub RecalculateSizes
	DefaultBigTitleSize = DefaultTextSize + 6
	DefaultTitleSize = DefaultTextSize + 2
	DefaultButtonTextSize = DefaultTextSize
	DefaultChartTextSize = DefaultTextSize - 2
	DefaultErrMsgSize = DefaultTextSize + 2
End Sub
