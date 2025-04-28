<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
  <xsl:output method="html" encoding="UTF-8" indent="yes"/>
  
  <xsl:template match="/">
    <html>
      <head>
        <title>Catálogo de Ratones Gaming</title>
        <style>
          /*CSS*/
          body, h2, table, th, td {
            margin: 0;
            padding: 0;
            font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;
          }

          body {
            background-color: #f4f7f6;
            color: #333;
            line-height: 1.6;
            padding: 20px;
          }

          h2 {
            text-align: center;
            color:rgb(12, 25, 61);
            font-size: 2rem;
            margin-bottom: 20px;
          }

          table {
            border-collapse: separate;
            border-spacing: 0 10px;
            width: 80%;
            margin: 0 auto;
            background-color: #fff;
            border-radius: 8px;
            box-shadow: 0 4px 8px rgba(0, 0, 0, 0.1);
          }

          th, td {
            padding: 12px;
            text-align: left;
            font-size: 1rem;
            border: 1px solid #ddd;
          }

          th {
            background-color: rgb(12, 25, 61);
            color: white;
            text-transform: uppercase;
            letter-spacing: 1px;
          }

          tr:nth-child(even) {
            background-color: #f9f9f9;
          }

          tr:hover {
            background-color: #f1f1f1;
          }

          td {
            border-radius: 5px;
          }

          /* Estilo para el precio */
          td[xsl:attribute="style"] {
            font-weight: bold;
          }

          .weight {
            background-color: #f4f4f4;
            padding: 2px 5px;
            border-radius: 5px;
            color: #333;
          }

          .wireless {
            font-weight: bold;
            color: #008CBA;
          }
        </style>
      </head>
      <body>
        <h2>Catálogo de Ratones Gaming</h2>
        <table>
          <tr>
            <th>Marca</th>
            <th>Modelo</th>
            <th>Precio (€)</th>
            <th>DPI</th>
            <th>Conexión</th>
            <th>Peso (g)</th>
          </tr>
          <xsl:for-each select="mice_catalog/mouse">
            <tr>
              <td><xsl:value-of select="brand"/></td>
              <td><xsl:value-of select="model"/></td>
              <td>
                <xsl:choose>
                  <xsl:when test="price > 100">
                    <xsl:attribute name="style">color: red; font-weight: bold;</xsl:attribute>
                  </xsl:when>
                  <xsl:otherwise>
                    <xsl:attribute name="style">color: green; font-weight: bold;</xsl:attribute>
                  </xsl:otherwise>
                </xsl:choose>
                <xsl:value-of select="price"/>
              </td>
              <td><xsl:value-of select="dpi"/></td>
              <td>
                <xsl:if test="connection = 'Wireless'">
                  <xsl:attribute name="class">wireless</xsl:attribute>
                </xsl:if>
                <xsl:value-of select="connection"/>
              </td>
              <td>
                <xsl:element name="span">
                  <xsl:attribute name="class">weight</xsl:attribute>
                  <xsl:value-of select="weight"/>
                </xsl:element>
              </td>
            </tr>
          </xsl:for-each>
        </table>
      </body>
    </html>
  </xsl:template>
</xsl:stylesheet>
