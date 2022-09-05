#!/usr/bin/env bash
rm target/Shipment-1.0.0.alpha.snapshot.jar
mvn package

# Updates the manifest
jar uvfm target/Shipment-1.0.0.alpha.snapshot.jar manifest.mf

# Execute
java -jar target/Shipment-1.0.0.alpha.snapshot.jar
#java -cp target/Shipment-1.0.0.alpha.snapshot.jar main.java.com.goalpioneers.shipment.PublicEntry