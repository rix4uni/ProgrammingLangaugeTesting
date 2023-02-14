#include <stdio.h>
#include <curl/curl.h>

int main(void)
{
  CURL *curl;
  CURLcode res;
  char *url = "https://www.dell.com";
  
  curl = curl_easy_init();
  if(curl) {
    for(int i=0; i<1000; i++) {
      curl_easy_setopt(curl, CURLOPT_URL, url);
      res = curl_easy_perform(curl);
      printf("%d\n", res);
    }
    curl_easy_cleanup(curl);
  }
  
  return 0;
}
