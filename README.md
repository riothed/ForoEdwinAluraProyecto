# ¿Qué es una API REST con Spring Boot?

Imagina que tienes un restaurante. La API es como el mesero, que lleva tu pedido a la cocina y luego te trae la comida.
REST son las reglas que sigue ese mesero para hacer bien su trabajo.
Spring Boot es como una cocina mágica 🔥 que hace que preparar la comida (crear programas) sea más rápido y fácil.

# 🎯 ¿Qué hace este Proyecto?
Este código crea una aplicación web que podemos encender y usar para enviar y recibir información, como si fuera el mesero de un restaurante.

## 📝 Explicando el código paso a paso

### 🔖 Paquete:
package com.desafio.forohub;
Es como una carpeta donde guardamos este archivo para tener todo bien ordenado.

### 📦 Importar herramientas:
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
Aquí estamos trayendo las herramientas de Spring Boot que nos ayudan a crear nuestra aplicación.

### 🏷️ Etiqueta mágica: 
@SpringBootApplication
Esto le dice a Spring Boot:
"¡Ey! Aquí comienza nuestra aplicación. Prepara todo para que funcione bien." ✨

### 🏠 La casa de la app: 
public class ForohubApplication {
Aquí creamos una clase que es como una casa donde vive toda la aplicación.

###🚀 El botón de encendido: 
public static void main(String[] args) {
    SpringApplication.run(ForohubApplication.class, args);
}
Esto es como el interruptor que enciende la aplicación.
Cuando presionamos "Play", Spring Boot empieza a trabajar. 🟢💻
