# BigDecimalMath
This is a repository containing examples to use Java's `BigDecimal` class, an adapted copy of Eric Obermühlner `BigDecimalMath` class and a more compact version of his [big-math](https://github.com/eobermuhlner/big-math) repository. A single program ([`BigDecimalMathExample`](BigDecimalMathExample.java)) illustrates the use of the library. The other examples show the use of some BigDecimal operations. `BigDecimal`'s `divide` and `sqrt` are shown at the start of `BigDecimalMathExample`.

This repository is a Java counterpart of the repository [decNumber](https://github.com/nilostolte/decNumber), which gives Mike Cowlishaw's decNumber C library with instructions to compile and run the examples, presenting similar usage of decimal arithmetic. The structures of the libraries are different but both are shown as a series of source code files compiled with the examples and with similar applications. The main difference is that `BigDecimalMath` and `big-math` both use Java's `BigDecimal` internally, while Mike Cowlishaw's decNumber C library implements everything from scratch.

## How to compile the examples

On Windows platforms just run `build.bat`. On other platforms copy the lines containing `javac` and paste them one by one on a console window.

## How to run the examples

On Windows platforms just run `run.bat`. On other platforms copy all the lines and paste them one by one on a console window.
