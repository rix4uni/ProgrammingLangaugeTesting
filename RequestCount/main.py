import requests

url = "https://www.dell.com"

for i in range(0, 1000):
	response = requests.get(url)
	print(response.status_code)