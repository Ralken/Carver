# Carver
A library that intercepts java method actions with simple annotation, helps you focus on real important things.

The idea of Carver is taken from the Spring framework of Java EE. A typical scenairo is that a method from the Controll layer needs access-token from andriod/iOS clients, developers can simplily add @LoginRequired annotation on the method, then it would intercept this request and check sign-in status. In this case, i started some research on developping a brief and extensible library on Android which aims at making android project low coupling between different modules.

# Gradle settings

# Usage
