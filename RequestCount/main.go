package main

import (
	"fmt"
	"net/http"
)

func main() {
	url := "https://www.dell.com"

	for i := 0; i < 1000; i++ {
		resp, err := http.Get(url)
		if err != nil {
			panic(err)
		}

		fmt.Println(resp.StatusCode)
		resp.Body.Close()
	}
}