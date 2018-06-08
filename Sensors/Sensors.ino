#include <ESP8266HTTPClient.h>
#include <ESP8266WiFi.h>
#include <SoftwareSerial.h>
#include <ArduinoJson.h>
 
double sensorCheck = 0;
int sensorPin = A0;
int sensorValue = 0;

 
void setup() {
  pinMode(sensorPin, INPUT);
  pinMode(4, OUTPUT);
  digitalWrite(7, LOW);
 
  Serial.begin(115200);                                  //Serial connection
  WiFi.begin("Ivaylo1199", "76119903");   //WiFi connection
 
  while (WiFi.status() != WL_CONNECTED) {  //Wait for the WiFI connection completion
 
    delay(500);
    Serial.println("Waiting for connection");
 
  }
 
}
 
void loop() {
 
 if(WiFi.status()== WL_CONNECTED){   //Check WiFi connection status
   sensorValue = analogRead(sensorPin);
  if(sensorValue <= 800){
   sendInfo();
  }
   }else{
 
    Serial.println("Error in WiFi connection");   
 
  }
}


void httpPost(JsonObject& json) {

  HTTPClient http;    //Declare object of class HTTPClient
 
  http.begin("http://192.168.1.101:8080/results");      //Specify request destination 
  char JSONmessageBuffer[1500];

  json.prettyPrintTo(JSONmessageBuffer, sizeof(JSONmessageBuffer));

  Serial.println(JSONmessageBuffer);

  delay(2000);

  http.addHeader("Content-Type", "application/json");

  http.POST(JSONmessageBuffer);

  String payload = http.getString();

  Serial.println(payload);    

  http.end(); 
}

void sendInfo(){
   digitalWrite(7, HIGH);
   sensorCheck = sensorCheck + 0.1;
   Serial.println(sensorCheck);
   
   StaticJsonBuffer<750> JSONbuffer;   

   JsonObject& root = JSONbuffer.createObject(); 

   JsonArray& values = root.createNestedArray("incidentValues");

   JsonObject& temp = values.createNestedObject();

  temp["sensorResult"] = sensorCheck;
  
  httpPost(root);
    delay(500);
    digitalWrite(7, LOW);
    
  sensorValue = 1000;
}
