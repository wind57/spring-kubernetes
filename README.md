# Pre requisits: <br>
Docker. <br>
minikube. <br>
kubernetes-cli also now as kubectl. <br>
<br>

# Steps to run this project: <br>
1° Clone this repo <br>
2° run `minikube start` <br>
3° run:
```
kubectl create ns study
kubectl apply -f manifests/service.yaml
kubectl apply -f manifests/serviceaccount.yaml
kubectl apply -f manifests/rolebinding.yaml
kubectl apply -f manifests/role.yaml
kubectl apply -f manifests/cm.yaml
kubectl apply -f manifests/deployment.yaml
```