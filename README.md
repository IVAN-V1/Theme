# Configuracion de tema claro y oscuro
Configura el tema de tu aplicacion con tema claro y oscuro y guarda el el estado del tema con SharedPreferences 

| Imagen 1 | Imagen 2 | Imagen 3 | Imagen 4 |
| -------- | -------- | -------- | -------- |
| ![Ejemplo de imagen](./capturas/1.jpg) | ![Ejemplo de imagen](./capturas/2.jpg) | ![Ejemplo de imagen](./capturas/3.jpg) | ![Ejemplo de imagen](./capturas/4.jpg) |

# Demostracion
<p align="center">
  <img src="./capturas/gif_1.gif" alt="Vista previa del video" />
</p>

# Estilo oscuro

```html
<resources xmlns:tools="http://schemas.android.com/tools">
    <!-- Base application theme. -->
    <style name="Base.Theme.Tema" parent="Theme.Material3.Dark.NoActionBar">


        <item name="android:textColor">@color/white</item>
        <item name="android:statusBarColor">#292727</item>

    </style>


    <style name="diseño_boton" parent="Widget.Material3.Button">
       <item name="backgroundTint">@color/white</item>
        <item name="android:textColor">@color/black</item>
    </style>



</resources>
```


# Estilo Claro

```html

<resources xmlns:tools="http://schemas.android.com/tools">
    <!-- Base application theme. -->
    <style name="Base.Theme.Tema" parent="Theme.Material3.Light.NoActionBar">

        <!-- Customize your light theme here. -->
        <item name="backgroundTint">@color/white</item>

        <item name="android:statusBarColor">@color/white</item>

    </style>

    <style name="diseño_boton" parent="Widget.Material3.Button">
        <item name="backgroundTint">@color/black</item>
        <item name="android:textColor">@color/white</item>
    </style>

</resources>
```
