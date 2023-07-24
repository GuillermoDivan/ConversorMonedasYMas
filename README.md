# ConversorMonedasYMas
Segundo challenge Alura. Aplicación de POO en Java. Conversor de moneda local a monedas extranjeras y viceversa. Combinado con otras conversiones posibles (temperatura, distancia, peso). Como el desafío sugería, se utilizaron métodos de la clase JOptionPane, del paquete javax.swing
El proyecto cuenta con 3 paquetes interrelacionados (Entidades, Servicios y Main).
En Entidades se incluyó la clase "Conversor", realizada de modo suficientemente genérico como para poder abordar todos los tipos de conversión pautados.
En Servicios se incluyó la clase "ServicioConversor", extendida luego a las clases de servicio específicas de cada conversión (ServicioConversorMonedas, ServicioConversorTemperatura, etc), aplicando sobreescritura de métodos en caso necesario. Así, se aplicaron conocimientos relativos a herencia y polimorfismo.
Además, se optó por realizar un ServicioMenu, donde desarrollar la lógica específica al menú, para evitar incluirla en el archivo de ejecución (main).
Por último, en el package Main sólo se encuentra una clase ejecutable con el mismo nombre, donde se llama al método que da inicio al programa. También, en aras de aplicar manejo de excepciones, se implementó aquí try/catch para que, de optarse por "cancelar" en cualquier momento de la ejecución, el programa se cerrase sin generar errores. 

Gracias por su lectura.
