#!/usr/bin/env groovy

// Page37: Assertions
assert(true)
assert 1 == 1 // equality, not identity
def x = 1
assert x == 1

def y = 1; assert y == 1

// Page43: Annotations for AST Transformations
@Immutable class FixedBook { 
   String title
}

def gina = new FixedBook('Groovy in Action')
def regina = new FixedBook(title: 'Groovy in Action')

assert gina.title == 'Groovy in Action'
assert gina == regina

try {
   gina.title = "Ooop!"
   assert false, "should not reach here"
} catch(ReadOnlyPropertyException e){
   println("yep, threw the exception")   
}

// Page45: Regular Expressions
//     / the string you are searching
//             / find operator
//                // the regular expression
assert '12345' =~ /\d+/
// FAILS: assert 'ABCDE' =~ /\d+/

