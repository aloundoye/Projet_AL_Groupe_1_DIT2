<?php

namespace App\Controllers;

use \Core\View;
use App\Models\Post;

/**
 * Posts controller
 */
class Posts extends \Core\Controller
{

    /**
     * Show the index page
     *
     * @return void
     */
    public function indexAction()
    {
        $posts = Post::getAll();

        View::renderTemplate('Posts/index.html', [
            'posts' => $posts
        ]);
    } /**
     * Show a post page
     *
     * @return void
     */
    public function showAction()
    {
        $id = $this->route_params['id'];
        $post = Post::getById($id);



        View::renderTemplate('Posts/show.html', [
            'post' => $post
        ]);
    }

    /**
     * Show the add new page
     *
     * @return void
     */
    public function newAction()
    {
        View::renderTemplate('Posts/new.html');
    }

    /**
     *add new user
     *
     * @return void
     */
    public function createAction()
    {
        $post = new Post($_POST);

        $post->save();
        $this->indexAction();
    }

    /**
     * Show the edit page
     *
     * @return void
     */
    public function editAction()
    {
        echo 'Hello from the edit action in the Posts controller!';
        echo '<p>Route parameters: <pre>' .
            htmlspecialchars(print_r($this->route_params['id'], true)) . '</pre></p>';
    }

    public function deleteAction()
    {

        $this->indexAction();
    }
}
