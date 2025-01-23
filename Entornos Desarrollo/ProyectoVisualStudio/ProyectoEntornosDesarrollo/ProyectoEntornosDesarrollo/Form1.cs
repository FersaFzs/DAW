using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace ProyectoEntornosDesarrollo
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
        }

        private void Form1_Load(object sender, EventArgs e)
        {
            CenterPanel();
        }

        private void CenterPanel()
        {
            // Asegura que el panel esté siempre centrado
            panel1.Left = (this.ClientSize.Width - panel1.Width) / 2;
            panel1.Top = (this.ClientSize.Height - panel1.Height) / 2;
        }
        private void button1_Click(object sender, EventArgs e)
        {
            // Crear una nueva instancia del formulario de catálogo
            Form2 formCatalogo = new Form2();

            // Establecer la misma posición que el Form1
            // Establecer la misma posición que el Form1
            formCatalogo.StartPosition = FormStartPosition.Manual;
            formCatalogo.Location = this.Location;

            // Mostrar la nueva ventana
            formCatalogo.Show();

            // Cerrar el formulario de inicio de sesión
            this.Hide();
        }

        private void Form1_FormClosing(object sender, FormClosingEventArgs e)
        {
            Application.Exit();
        }
        private void panel1_Paint(object sender, PaintEventArgs e)
        {

        }

        private void Form1_Resize(object sender, EventArgs e)
        {
            CenterPanel();
        }

        private void textBox1_TextChanged(object sender, EventArgs e)
        {

        }

        private void textBox2_TextChanged(object sender, EventArgs e)
        {

        }

        

        private void textBox3_TextChanged(object sender, EventArgs e)
        {

        }

        private void pictureBox1_Click(object sender, EventArgs e)
        {

        }

        private void pictureBox1_Click_1(object sender, EventArgs e)
        {

        }

        
    }
}
