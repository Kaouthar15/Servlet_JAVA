<html>
<head><title>Formulaire</title></head>
<body >
	<form method="get" action="formulaire" >
		<h3>
			Civilité : 
			<select name="civilite">
				<option>Monsieur</option>
				<option>Madame</option>
				<option>Mademoiselle</option>
			</select>
		</h3>
		<h3>Nom : <input type="text" name="nom" size="24"/></h3>
		<h3>Prénom : <input type="text" name="prenom" size="24"/></h3>
		<h3>Age : <input type="text" name="age" size="5"/></h3>
		<hr/><input type="submit" value="Envoyer le Formulaire">
		<input type="reset">
	</form>
</body>
</html>