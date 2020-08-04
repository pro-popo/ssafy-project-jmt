package com.ssafy.videoconference.model.note.service;

import java.util.List;

import com.ssafy.videoconference.controller.command.ChangeContentCommand;
import com.ssafy.videoconference.controller.command.ChangeTitleCommand;
import com.ssafy.videoconference.controller.command.SaveNoteCommand;
import com.ssafy.videoconference.model.note.bean.Note;




public interface NoteService {
	
	
	Note saveNote(SaveNoteCommand command);
	
	
	void changeTitle(ChangeTitleCommand command);
	
	
	void changeContent(ChangeContentCommand command);
	
	
	void deleteByNo(int noteNo);
	
	
	List<Note> findByGroup(int groupNo, String id);
	
	
	Note findByNo(int noteNo);
	
}