cd /opt/feeservice/FeeService
rm /var/log/feeservice/*
export SPRING_PROFILES_ACTIVE=poc
nohup mvn clean:clean compile exec:java -Dexec.mainClass=com.abnamro.poc.feeservice.FeeService >/var/log/feeservice/feeservice.out 2>&1 &
