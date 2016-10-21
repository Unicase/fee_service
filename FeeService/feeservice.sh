nohup mvn compile exec:java -Dexec.mainClass=com.abnamro.poc.feeservice.FeeService >/var/log/feeservice/feeservice.out 2>&1 &
