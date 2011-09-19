// This compiles just fine with SBT
// When compiling with IntelliJ, the following line complains:
// error: expected class or object definition
resolvers ++= Seq(
  "Web plugin repo" at "http://siasia.github.com/maven2")
