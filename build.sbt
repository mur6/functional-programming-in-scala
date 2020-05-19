scalaVersion := "2.13.2"
val awsVersion            = "2.10.79"

libraryDependencies ++= Seq(
  "org.scala-lang.modules" %% "scala-java8-compat" % "0.9.1",
  "software.amazon.awssdk" % "dynamodb"            % awsVersion,
  "software.amazon.awssdk" % "secretsmanager"      % awsVersion,
  "software.amazon.awssdk" % "s3"                  % awsVersion
)
