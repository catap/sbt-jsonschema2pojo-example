resolvers += Resolver.url("sbt-jsonschema2pojo-plugin-releases",
   url("http://dl.bintray.com/catap/sbt-plugins/"))(Resolver.ivyStylePatterns)
       
addSbtPlugin("com.github.catap" % "sbt-jsonschema2pojo" % "0.3")
