#Autores
<p>Lucas Assis</p>
<p>Matheus Gustavo</p>

# JSON Parser

<p>Converte um objeto em JSON de acordo com os seus atributos, tendo suporte para os tipos: </p>

<ol>
  <li>Primitivos</li>
  <li>Wrappers</li>
  <li>LocalDate</li>
  <li>LocalDateTime</li>
  <li>Objects</li>
  <li>Collections</li>
</ol>

# JSON Ignore

<p>Foi criada a annotation @JsonIgnore que pode ser anotada em campos e tem como parametro "ignore", que recebe uma lista do nome dos campos que devem ser ignorados em formato String.</p>
<ol>
	<li>Quando informar o parametro "ignore", todos os campos que 	estejam informados no parametro annotation serão ignorados.</li>
	<li>Quando não informar o parametro "ignore", o campo será ignorado 	por completo.</li>
</ol>