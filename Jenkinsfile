pipeline {
    agent any

    stages {
        stage('Checkout') {
            steps {
                // Realiza el checkout del código fuente en el directorio raíz
                checkout scm
            }
        }

        stage('Build') {
            steps {
                // Cambia al directorio 'billing' para ejecutar la construcción
                dir('billing') {
                    // Construir el proyecto Maven
                    sh 'mvn clean compile'
                }
            }
        }

        stage('Test') {
            steps {
                // Cambia al directorio 'billing' para ejecutar los tests
                dir('billing') {
                    // Ejecutar los tests Maven
                    sh 'mvn test'
                }
            }
        }

        stage('Package') {
            steps {
                // Cambia al directorio 'billing' para empaquetar la aplicación
                dir('billing') {
                    // Empaquetar la aplicación
                    sh 'mvn package'
                }
            }
        }
    }

    post {
        always {
            dir('billing') {
                // Publica los resultados de los tests
                junit '**/target/surefire-reports/*.xml'
            }
        }

        success {
            echo 'Build y tests completados exitosamente.'
        }

        failure {
            echo 'Build o tests fallaron.'
        }
    }
}