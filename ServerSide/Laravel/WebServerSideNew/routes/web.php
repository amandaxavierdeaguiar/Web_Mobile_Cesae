<?php

use Illuminate\Support\Facades\Route;
use App\Http\Controllers\IndexController;
use App\Http\Controllers\TaskController;
use App\Http\Controllers\UserController;

Route::get('/', [IndexController::class,'welcome'])->name('welcome');

Route::get('/home', [IndexController::class,'home'])->name('homepage');

Route::get('/hello_world/{name}', function($name) {
    return '<h1>Hello ' .$name. '</h1>';
});

Route::get('/users', [UserController::class,'usersAll'])->name('users.all');

Route::get('/add_users', [UserController::class,'users'])
->name('users.new');

Route::get('/insert-user', [UserController::class, 'insertUser'])->name('users.insert');


Route::get('/user_show/{id}', [UserController::class, 'viewUser'])->name('users.show');

Route::get('/tasks', [TaskController::class,'allTasks'])->name('tasks.all');


// Rota de fallback, onde o user cai quando clica numa rota que não está definida
// Fica no router - nao vai para o controller
Route::fallback(function () {
    return view('utils.fallback');
});
