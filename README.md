# practica_kubernetes1
hola

TOCA ACTIVAR GITHUB SERVER
TOCA ACTIVAR SONARQUBE SERVER
PLUGIN DOCKER Y CONFIGURAR DOCKER CLOUD

mirar pr activos
+refs/pull/*/head:refs/remotes/origin/pr/*

current_status = $.action
pr_title = $.pull_request.title


case "$current_status" in
    opened|reopened|synchronize)
        echo "New PR created: $pr_title"
        echo "Build"
        # Ejecuta los comandos necesarios aquí, por ejemplo:
        cd billing
        mvn clean test //tambien puede ser compile 
        ;;
    *)
        echo "Condition not met: Skipping this step."
        exit 1
        ;;
esac

sonar.projectKey=sonarqube
sonar.sources=billing/src/main/java
sonar.java.binaries=billing/target/classes