# BigDecimalMath
This is a repository containing examples to use Java's `BigDecimal` class, an adapted copy of Eric Obermühlner `BigDecimalMath` class and a more compact version of his [big-math](https://github.com/eobermuhlner/big-math) repository. A single program ([`BigDecimalMathExample`](BigDecimalMathExample.java)) illustrates the use of the library. The other examples show the use of some BigDecimal operations. `BigDecimal`'s `divide` and `sqrt` are shown at the start of `BigDecimalMathExample`.

This repository is a Java counterpart of the repository [decNumber](https://github.com/nilostolte/decNumber), which gives Mike Cowlishaw's decNumber C library with instructions to compile and run the examples, presenting similar usage of decimal arithmetic. The structures of the libraries are different but both are shown as a series of source code files compiled with the examples and with similar applications. The main difference is that `BigDecimalMath` and `big-math` both use Java's `BigDecimal` internally, while Mike Cowlishaw's decNumber C library implements everything from scratch.

## Running compound interest example 
In [Mike Cowlishaw's decNumber C library](https://github.com/nilostolte/decNumber) this is done in examples 2 and 3. Here it's done by the class CompoundInterest.java, which calculates compound interest for a capital of $1000 over 2 years at 3% a year interest rate. Given the simplicity of the program, the values aren't passed as parameters but written directly in the source code. This example (or any other example here) can be run directly using `java` command as shown:

```
java CompoundInterest.java
```
## Running the other examples
Just using `java` command directly as shown:

```
java DecimalError
java DecimalExact
java BigDecimalMathExample
```

## How to compile the examples

This is not necesssary to run the examples, since they can run only using `java` commands. This is only ncessary to check errors when the sources are modified.

On Windows platforms just run `build.bat`. On other platforms copy the lines containing `javac` and paste them one by one on a console window.

## How to run all the examples at once

On Windows platforms just run `run.bat`. On other platforms copy all the lines and paste them one by one on a console window.
