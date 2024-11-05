<!--<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Document</title>
</head>
<body>-->
@extends('layout.femaster')

@section('content')
    <h3>Sou uma blade de Users!</h3>
    <table class="table">
        <thead>
          <tr>
            <th scope="col">id</th>
            <th scope="col">nome</th>
            <th scope="col">email</th>
            <th scope="col">NIF</th>
          </tr>
        </thead>
        <tbody>
            @foreach ($users as $user)
                <tr>
                    <th scope="row">{{$user->id}}</th>
                    <td>{{$user->name}}</td>
                    <td>{{$user->email}}</td>
                    <td>{{$user->nif}}</td>
                    <td><a href="{{route('users.show', $user->id)}}" type="button" class="btn btn-info">Ver</a></td>
                    <td><a type="button" class="btn btn-danger">Delete</a></td>
                </tr>
            @endforeach
        </tbody>
      </table>
    <ul><!-- SE FOR OBJETO $user->email -->
        @foreach ($users as $user)
            <li>O nome é {{$user->name}} e o email é {{$user->email}}</li>
        @endforeach
    </ul>
@endsection
<!--
</body>
</html>-->
