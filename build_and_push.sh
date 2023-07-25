./gradlew clean build
docker build . -t irastefan/products-api:1.0.0
docker push irastefan/products-api:1.0.0