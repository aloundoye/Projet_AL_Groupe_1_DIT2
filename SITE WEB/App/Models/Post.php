<?php

namespace App\Models;

use PDO;

/**
 * Post model
 *
 * PHP version 5.4
 */
class Post extends \Core\Model
{

    public function __construct($data)
    {
        foreach ($data as $key => $value) {
            $this->$key = $value;
        };
    }

    /**
     * Get all the posts as an associative array
     *
     * @return array
     */
    public static function getAll()
    {


        try {
            $db = static::getDB();

            $stmt = $db->query('SELECT * FROM posts
                                ORDER BY created_at DESC');

            return $stmt->fetchAll(PDO::FETCH_ASSOC);

        } catch (PDOException $e) {
            echo $e->getMessage();
        }
    }

    public static function getById($id)
    {
        $postId = intval($id);
        try {
            $db = static::getDB();
            $sql = 'SELECT * FROM posts WHERE id = :postId';
            $stmt = $db->prepare($sql);
            $stmt->bindParam(':postId', $postId, PDO::PARAM_INT);
            $stmt->execute();

            return $stmt->fetch(PDO::FETCH_ASSOC);

        } catch (PDOException $e) {
            echo $e->getMessage();
        }
    }

    public function save()
    {

        $sql = 'INSERT INTO posts (title, content)
            VALUES (:title, :content)';

        $db = static::getDB();
        $stmt = $db->prepare($sql);

        $stmt->bindValue(':title', $this->title, PDO::PARAM_STR);
        $stmt->bindValue(':content', $this->content, PDO::PARAM_STR);


        $stmt->execute();
    }
}
