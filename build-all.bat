@echo off
echo.
echo ====================================
echo == BUILDANDO TODOS OS MICROSERVIÇOS ==
echo ====================================

echo.
echo 📦 Building usuarioservice...
docker run --rm -v %cd%\usuarioservice:/app -w /app maven:3.9.4-eclipse-temurin-17 mvn clean package -DskipTests

echo.
echo 🏢 Building salaservice...
docker run --rm -v %cd%\salaservice:/app -w /app maven:3.9.4-eclipse-temurin-17 mvn clean package -DskipTests

echo.
echo 📅 Building reservaservice...
docker run --rm -v %cd%\reservaservice:/app -w /app maven:3.9.4-eclipse-temurin-17 mvn clean package -DskipTests

echo.
echo ✅ Todos os serviços foram compilados com sucesso!
pause
