name := "saasquatch-skills-test"

version := "0.0.1"

scalaVersion := "2.12.4"

EclipseKeys.projectFlavor := EclipseProjectFlavor.Java // Java project. Don't expect Scala IDE
EclipseKeys.executionEnvironment := Some(EclipseExecutionEnvironment.JavaSE18)
EclipseKeys.preTasks := Seq(compile in Compile)
// Use .class files instead of generated .scala files for views and routes
EclipseKeys.createSrc := EclipseCreateSrc.ValueSet(EclipseCreateSrc.ManagedClasses, EclipseCreateSrc.ManagedResources)
// Include JavaDoc and source
EclipseKeys.withJavadoc := true
EclipseKeys.withSource := true

lazy val root = (project in file(".")).enablePlugins(PlayJava)

libraryDependencies += guice
