version := "0.1-SNAPSHOT"

scalaVersion := "2.11.5"

name := "sbt-jsonschema2pojo-example"

organization := "com.github.catap"

libraryDependencies += "commons-lang" % "commons-lang" % "2.6"

libraryDependencies += "com.fasterxml.jackson.core" % "jackson-databind" % "2.5.1"

mainClass in (Compile, run) := Some("JsonSchema2PojoExample")

targetPackage in jsonSchema2PoJo := "ExamplePoJo"
