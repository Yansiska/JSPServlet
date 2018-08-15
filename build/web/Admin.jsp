<!DOCTYPE html>
<html>
<head>
	<title>Form Registrasi</title>
</head>
<body>
	<h1> "Form Registrasi" </h1>
	<br>
	<form name="myform" action="cAdmin" method="POST">
		<label>ID_Admin :</label> <br> 
	<input type="text" placeholder="Ketik ID Admin" name="txtIDAdmin">
	<br><br>
		<label>Username :</label> <br> 
	<input type="text" placeholder="Ketik Nama Anda" name="txtNama">
	<br><br>
		<label> Password :</label> <br>
	<input type="password" name="pass">
	<br><br>
	<button type="submit">Save</button>&nbsp;&nbsp;
	<button type="reset">Reset</button>
	</form>
</body>
</html>