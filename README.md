# geiger
This application is designed to work as an interface service, taking http GET requests from a GMC-500+ WiFi
enabled Giger-Müller counter.

It is designed primarily to work on a raspberry pi, as a low cost "it's somewhere in the network" server.

## Building
Building is intended to be multi-arch
~~~~
docker buildx build --platform linux/amd64,linux/arm64,linux/arm/v7  -t [org]/geiger:latest -t [org]/geiger:[version] --push .
~~~~
