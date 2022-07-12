mvn clean install
docker build -t pet-project/gateway .
docker tag pet-project/gateway registry.digitalocean.com/pet-project/gateway
docker push registry.digitalocean.com/pet-project/gateway
kubectl delete deploy gateway
kubectl create -f kube-manifests/deployment.yaml
kubectl get pods

