package org.example;

import java.util.List;
import java.util.Objects;

public class Note {
    private String chapter;
    private String topic;
    private  List<String> notes;

    public String getChapter() {
        return chapter;
    }

    public void setChapter(String chapter) {
        this.chapter = chapter;
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public List<String> getNotes() {
        return notes;
    }

    public void setNotes(List<String> notes) {
        this.notes = notes;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Note note = (Note) o;
        return Objects.equals(chapter, note.chapter) && Objects.equals(topic, note.topic) && Objects.equals(notes, note.notes);
    }

    @Override
    public int hashCode() {
        return Objects.hash(chapter, topic, notes);
    }

    @Override
    public String toString() {
        return "Note{" +
                "chapter='" + chapter + '\'' +
                ", topic='" + topic + '\'' +
                ", notes=" + notes +
                '}';
    }
}
