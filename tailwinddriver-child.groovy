metadata {
    definition (
        name: "Tailwind Garage Door Child Device", 
		namespace: "dabtailwind-gd", 
		author: "dbadge"		
    ) {
        capability "GarageDoorControl"
        attribute "Status", "string"
        command "open"
        command "close"
    }
}

void close(){
     parent.childClose(device.deviceNetworkId)   
}

void open(){
     parent.childOpen(device.deviceNetworkId)   
}

