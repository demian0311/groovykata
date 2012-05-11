#!/usr/bin/env groovy

class Greet {
   def name

   Greet(who) { 
      name = who[0].toUpperCase() + who[1..-1]
   }

   def salute() { 
      println "Hello $name!"
   }

   // alternative way to define a function
   def foo = { arg1, arg2="stuff" ->
      println "foo was called with: " + arg1 + " and " + arg2
   }

   def bar(arg1, arg2="stuff"){
      println "bar was called with: " + arg1 + " and " + arg2
   }
}

g = new Greet('world')
g.salute()

g.foo('hi', 'dude')
g.foo('hello')

g.bar('hi', 'dude')
g.bar('hello')





