#language: pt
#encoding: utf-8

Funcionalidade: Consulta Curso PO
  Realiza uma pesquisa por curso no site da Iterasys PO

  Esquema do Cenario: Busca por curso simples com clique utilizando exemplos PO
    Dado que o visitante acessa o site da Iterasys PO
    E preenche o termo de busca como <termo> PO
    E clica no icone da lupa PO
    Entao vizualiza a lista de cursos relacionado a <termo> PO
    Quando seleciona o curso <titulo> na lista PO
    Entao visualiza o titulo como <titulo> e preco como <preco> PO

    Exemplos:
      | termo      | titulo     | preco      |
      | "MANTIS"   | "Mantis"   | "R$ 49,99" |
      | "testlink" | "TestLink" | "R$ 79,99" |