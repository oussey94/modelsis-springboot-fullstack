# modelsis-springboot-fullstack
Pour ce projet nous avons utilisé une images postgres docker pour la configuration de notre ficher appication.proporties
Avec la commande 
### docker run --name mon-postgresql-img -e POSTGRES_USER=oussey94 -e POSTGRES_DB=modelsis -e POSTGRES_PASSWORD=Safietou01 -p 5432:5432 -v /data:/
### var/lib/postgresql/data -d postgres
Une fois le projet cloner et apres mise oeuvre de votre environnement dev vous pouvez utiliser 
#### http://localhost:9090/swagger-ui/index.html pour voir la structuration notre API
et faire vos différents traitement métiers.
