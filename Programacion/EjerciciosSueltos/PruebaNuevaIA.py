import tkinter as tk
from tkinter import simpledialog
from reportlab.lib.pagesizes import letter
from reportlab.pdfgen import canvas

def generar_pdf(nombre, direccion):
    # Crear un archivo PDF
    c = canvas.Canvas("carta.pdf", pagesize=letter)
    
    # Definir la plantilla con los huecos rellenados
    plantilla = f"Hola {nombre}, su pedido será entregado en {direccion}."
    
    # Escribir la plantilla en el PDF
    c.drawString(100, 750, plantilla)
    
    # Guardar el PDF
    c.save()

def solicitar_datos():
    # Crear la ventana principal
    root = tk.Tk()
    root.withdraw()  # Ocultar la ventana principal

    # Solicitar los datos al usuario
    nombre = simpledialog.askstring("Nombre", "Introduce tu nombre:")
    direccion = simpledialog.askstring("Dirección", "Introduce tu dirección:")

    # Generar el PDF con los datos introducidos
    if nombre and direccion:
        generar_pdf(nombre, direccion)
        print("PDF generado correctamente.")
    else:
        print("No se introdujeron todos los datos.")

if __name__ == "__main__":
    solicitar_datos()