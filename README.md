# Simulacion 01 - Awakelab
Portal que permite mostrar los registros provenientes de un reporte, y que permite agregar un nuevo registro a una tabla a través de un formulario.

- Portal compuesto solo por una página vista.
- El sistema es construido con el framework Spring MVC, conectándose a una
  base de datos Oracle 11g express y diseño responsive con Bootstrap.
- Al abrir la página, se despliega una tabla superior con el resumen de los registros
  existentes en la base de datos.
- Bajo la tabla, hay un formulario que permite agregar una nueva ayuda.
- Se usa servicio REST que retorna el listado de beneficiarios en formato JSON. Este
  servicio es consumido desde el mismo sitio, y utilizado para cargar los datos del
  campo de selección del formulario.
