#!/usr/bin/env groovy

// Page11: listing a file
def number = 0
new File('chapter1.groovy').eachLine{ line ->
   number++
   println "$number: $line"
}

// Page11: printing a list
def classes = [String, List, File] // list literal
for(clazz in classes){
   println clazz.package.name
}

// Page12: property access and avoiding for loops
println("----")
println(classes*.package*.name)

println("----")
(classes*.package*.name).each{println it}

println("----")
// lots of power in this expression
(classes.package.name).each{println it}


