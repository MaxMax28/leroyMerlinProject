# leroyMerlinProject
instructions on how to deploy the service in dev developer environment

# start project
open the terminal and go to the root directory of the project
to run:
docker build -t leroy merlin .
docker ru -p 3000:3000 leroy merlin

after launching the application, open a new terminal.
you can see the status:
docker ps -a

and also, you can send requests
curl http://localhost:3000/actuator/health
curl http://localhost:3000/api/v1/test
