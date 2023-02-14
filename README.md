# ProgrammingLangaugeTesting
Testing all programming langauge speed

<details>
  <summary>Printing 10 Million Numbers ==>> NumberCount</summary>
  
  ```
## c
gcc main.c -o main && time ./main && rm -rf main
real    1m27.284s
user    0m1.841s
sys     0m22.355s

## c++
g++ main.cpp -o main && time ./main && rm -rf main
real    1m28.297s
user    0m2.024s
sys     0m26.652s

## java
time java main.java
real    1m30.281s
user    0m8.585s
sys     1m10.179s

## javascript
time node main.js
real    7m19.392s
user    3m35.598s
sys     3m44.641s

## go 
time go run main.go
real    1m30.163s
user    0m6.332s
sys     0m51.590s

## rust
rustc main.rs && time ./main && rm -rf main
real    1m28.775s
user    0m2.317s
sys     0m30.410s

## python3
time python3 main.py
real    1m38.383s
user    0m19.220s
sys     1m19.150s

## bash
chmod +x main.sh && time ./main.sh
real    2m41.728s
user    1m7.071s
sys     1m34.644s
  ```
</details>

<details>
  <summary>Sending 1000 Resquests ==>> RequestCount</summary>
  
  ```
Sending 1000 Resquests ==>> RequestCount
## c
gcc main.c -o main && time ./main && rm -rf main

## c++
g++ main.cpp -o main && time ./main && rm -rf main

## java
time java main.java
real    2m8.473s
user    0m20.570s
sys     0m4.449s

## javascript
time node main.js
real    0m18.034s
user    0m2.086s
sys     0m0.310s

## go 
time go run main.go
real    0m59.215s
user    0m0.693s
sys     0m1.519s

## rust
rustc main.rs && time ./main && rm -rf main

## python3
time python3 main.py
real    2m44.135s
user    0m55.205s
sys     0m0.770s

## bash
chmod +x main.sh && time ./main.sh
real    2m49.818s
user    0m48.051s
sys     0m3.393s
  ```
</details>
