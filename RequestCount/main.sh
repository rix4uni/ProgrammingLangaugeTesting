#!/bin/bash

url="https://www.dell.com/en-in"
user_agent="Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/109.0.0.0 Safari/537.36"

for i in {1..1000}
do
  status_code=$(curl -s -o /dev/null -w "%{http_code}" -H "User-Agent: $user_agent" $url)
  echo $status_code
done