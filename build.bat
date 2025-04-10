@ECHO OFF
javac DecimalError.java
if %ERRORLEVEL% NEQ 0 (
    @ECHO "Error compiling DecimalError.java. Aborting."
    EXIT /B 1
)
javac DecimalExact.java
if %ERRORLEVEL% NEQ 0 (
    @ECHO "Error compiling DecimalExact.java. Aborting."
    EXIT /B 1
)
javac ComposedInterest.java
if %ERRORLEVEL% NEQ 0 (
    @ECHO "Error compiling ComposedInterest.java. Aborting."
    EXIT /B 1
)
javac BigDecimalMathExample.java
if %ERRORLEVEL% NEQ 0 (
    @ECHO "Error compiling BigDecimalMathExample.java. Aborting."
    EXIT /B 1
)
