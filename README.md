# Carver
A library that intercepts java method actions with simple annotation, helps you focus on real important development.

The idea of Carver is taken from the Spring framework of Java EE. A typical scenairo is that a method from the Controll layer needs access-token from andriod/iOS clients, developers can simplily add @LoginRequired annotation on the method, then it would intercept this request and check sign-in status. In this case, i started some research on developping a brief and extensible library on Android which aims at making android project low coupling between different modules.

Unlike dagger and butterknife, Carver is based on aspectj and works at compiling time, it affects the generated classed instead of java source code. If you are interested in considering what it really does, please de-compile the classes and view the source code.

## Gradle settings
## Project specification (Update on 9 Jan. 2018)
The development schedule of this project has to be postponed for some days due to my personal time. I'm sure to reactivate it as soon as possible.

## TO DO 
* Optimize the user interaction of sample project
* Publish plugin to Bintray separately
* Library project: instance management of Interceptor component sub-implementation.

## License

```
    Copyright 2015 Ralken Ltd.

    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.
```
