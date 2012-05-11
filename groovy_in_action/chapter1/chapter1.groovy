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

[1, 2, 4, 5, 6].each{println it}

def sum = 0
[1, 2, 4, 5, 6].each{sum += it}
println "the sum is: " + sum

// Page12: XML handling
def customers = new XmlSlurper().parse(new File('customers.xml'))
for (customer in customers.corporate.customer){
   println "${customer.@name} works for ${customer.@company}"
}

// Page13: Scripting the web
// doesn't work, the service is down
//def text = "http://azarask.in/services/rhyme/?q=movie".toURL().text 
//for (rhyme in evaluate(text)) println rhyme


