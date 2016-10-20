MAVEN_OPTS="-javaagent:jolokia-jvm-1.3.5-agent.jar=host=0.0.0.0"
export MAVEN_OPTS
mvn compile exec:java -Dexec.mainClass=com.abnamro.poc.feeservice.FeeService
