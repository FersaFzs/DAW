namespace MyAppEscritorio
{
    public partial class search_button : Form
    {
        public search_button()
        {
            InitializeComponent();
        }

        private void button1_Click(object sender, EventArgs e)
        {
            Form2 form2 = new Form2();
            form2.Show();
            this.Hide();

            form2.FormClosed += (s, arg) =>
            {
                this.Show();
            };
        }

        private void checkBox1_CheckedChanged(object sender, EventArgs e)
        {
       
        }
    }
}
