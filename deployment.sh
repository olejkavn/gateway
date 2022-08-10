mvn clean install
docker build -t gateway .
docker tag gateway otymkovskyi/gateway
docker push otymkovskyi/gateway
kubectl delete deploy gateway
kubectl create -f kube-manifests/deployment.yaml
kubectl get pods

