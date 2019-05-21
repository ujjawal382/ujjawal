<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
 <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
        <title></title>
        <meta name="description" content="">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
      <script>
        
      </script>
</head>
<body>
        <div class="panel panel-primary">




            <!---------------------------------------Header Strats----------------------------------------->
            <div class="panel-heading"><center><h4>Home Tutor Service</h4></center></div>
            <!---------------------------------------Header Ends------------------------------------------->



            <!---------------------------------------Navigation Starts------------------------------------->
            <div class="panel-body">
                <div class="container">
  <h2>Trainee Registration Form</h2>
  <form class="form-horizontal col-sm-offset-4" id="form" action="registerTrainee" method="post" modelAttribute="traineedetail">
    <div class="form-group">
      <label class="control-label col-sm-2" for="email">Tutor. Id. :</label>
      <div class="col-sm-4">
        <input type="text" class="form-control" id="tutor_id" placeholder="Enter Tutor id" name="tutor_id">
      </div>
    </div>
    <div class="form-group">
      <label class="control-label col-sm-2" for="pwd">Name :</label>
      <div class="col-sm-4">          
        <input type="text" class="form-control" id="name" placeholder="Enter the name of Trainee" name="name">
      </div>
    </div>
    <div class="form-group">
      <label class="control-label col-sm-2" for="email">House No :</label>
      <div class="col-sm-4">
        <input type="text" class="form-control" id="address.house_no" placeholder="Enter House No" name="address.house_no">
      </div>
    </div>
    <div class="form-group">
      <label class="control-label col-sm-2" for="pwd">City :</label>
      <div class="col-sm-4">          
        <input type="text" class="form-control" id="address.city" placeholder="Enter the City Name" name="address.city">
      </div>
    </div>
    <div class="form-group">
      <label class="control-label col-sm-2" for="pwd">State :</label>
      <div class="col-sm-4">          
        <input type="text" class="form-control" id="address.state" placeholder="Enter the State Name" name="address.state">
      </div>
    </div>
    <div class="form-group">
      <label class="control-label col-sm-2" for="email">Pincode :</label>
      <div class="col-sm-4">
        <input type="text" class="form-control" id="address.pin_code" placeholder="Enter Pincode" name="address.pin_code">
      </div>
    </div>
    
    <div class="form-group">
      <div class="col-sm-offset-2 col-sm-4">
        <button type="submit" class="btn btn-primary">Register Trainee</button>
      </div>
    </div>
            </div>
            <!--------------------------------------------------Navigation Ends--------------------------->


        </div>

</body>
</html>